javac -cp .:path/to/junit-jupiter-api-5.7.1.jar:path/to/junit-jupiter-engine-5.7.1.jar MyArrayList.java MyArrayListTest.java
java -cp .:path/to/junit-jupiter-api-5.7.1.jar:path/to/junit-jupiter-engine-5.7.1.jar org.junit.platform.console.ConsoleLauncher --select-class MyArrayListTest

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
