package com.java2bigdata.corejava.exceptions;

public class ExceptionBasics {

    /*
    try - catch blocks

    try {
   // Code that may throw an exception
    } catch (ExceptionType1 ex) {
   // Handle exception of type ExceptionType1
    } catch (ExceptionType2 ex) {
   // Handle exception of type ExceptionType2
    }

     */


    /*
    try - catch - finally

    try {
   // Code that may throw an exception
    } catch (ExceptionType ex) {
   // Handle exception
    } finally {
   // Cleanup code, executed always
    }
     */


    /*
    bast practice -  Catch the most specific exception

    try {
   // Code that may throw exceptions
    } catch (FileNotFoundException ex) {
   // Handle FileNotFoundException
    } catch (IOException ex) {
   // Handle IOException and its other subclasses (except FileNotFoundException)
    }

     */


    /*

    Don’t swallow exceptions- When you catch an exception, handle it properly or log it for troubleshooting.

    try {
   // Code that may throw an exception
    } catch (IOException ex) {
   // Log the exception or handle it properly
   ex.printStackTrace();
    }
     */



    //Use the finally block for cleanup


    /*

    FileReader reader = null;

    try {
    reader = new FileReader("file.txt");
    // Use the reader
    } catch (IOException ex) {
    // Handle exception
    } finally {
    if (reader != null) {
        try {
            reader.close();
        } catch (IOException e) {
            // Handle exception
        }
    }
}
     */

    //Exception Handling Enhancements in Java 17

    //try-with-resources - which automatically closes resources, simplifying the cleanup process in a finally block.

    /*
    try (FileReader reader = new FileReader("file.txt")) {
   // Use the reader
} catch (IOException ex) {
   // Handle exception
}
     */



}
