/**
    1.4 Import lesson4 Java packages to make them accessible in your code
 */
package javabasics;

/*
    Note: subpackages of java.util (e.g. java.util.concurrent) are NOT imported
 */
import java.util.*; // star means import all classes in a package
// import java.sql.*;// this would result in an error, as could not resolve Date class, as ambiguous
import java.sql.Date;
import java.util.ArrayList;

public class Lesson4 {

    public static void main(String[] args) {

        /*
            Need to import or use fully-qualified name
         */
        // HashMap hashMap = new HashMap();
        java.util.HashMap hashMap = new java.util.HashMap<>();

        // for the ArrayList, we have used an import
        ArrayList arrayList = new ArrayList();

         /*
        Java has two date classes.
        You need to avoid name class conflicts by using
        fully qualified class names.
        'Fully qualified' means the top level package and all subpackages
        (not just subpackages).
        As evident below, the more specific import (java.sql.Date)
        is used by default, rather than the 'all' import (java.util.*)
         */
        java.util.Date date = new java.util.Date(); // imported java.util.*;
        Date date2 = new Date(2000); // imported java.sql.Date;
    }
}
