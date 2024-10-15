ROOT="./src/main"
OUT="./out"
LIB="./lib"


rm -rf $OUT

javac --release 17 -d $OUT/classes -cp $LIB/Pokemon.jar $(find $ROOT/java -name "*.java")
jar -cfmv $OUT/base.jar $ROOT/resources/META-INF/MANIFEST.mf -C $OUT/classes .

unzip -o $LIB/Pokemon.jar -d $OUT/classes
jar -cfmv $OUT/full.jar $ROOT/resources/META-INF/MANIFEST.mf -C $OUT/classes .