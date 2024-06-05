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
