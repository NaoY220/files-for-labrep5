javac -cp .:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar *.java
java -cp .:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar org.junit.runner.JUnitCore MyArrayListTest

if [[ $? -eq 0 ]]; then
    echo "yay"
else
    echo "ummm"

JAVA_FILE="MyArrayList.java"
CLASS_NAME="MyArrayList"

# Compile the Java program
javac $JAVA_FILE

if [[ $? -eq 0 ]]; then
    # Run the Java program if the compilation was successful
    java $CLASS_NAME
else
    echo "Compilation failed."
fi
