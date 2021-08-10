package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
ListView listview;//for viewing the content(sequence(array)) in a list format.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String send="package com.example.listview;";
        String [] data={"Python","Java","C","C++","JavaScript","HTML","ReactJS"};//data is a string array which contains the values which is to be displayed in the list view.
        String [] info={"Python is an interpreted high-level general-purpose programming language. Python's design philosophy emphasizes code readability with its notable use of significant indentation. Its language constructs as well as its object-oriented approach aim to help programmers write clear, logical code for small and large-scale projects.[30]\n" +
                "\n" +
                "Python is dynamically-typed and garbage-collected. It supports multiple programming paradigms, including structured (particularly, procedural), object-oriented and functional programming. Python is often described as a \"batteries included\" language due to its comprehensive standard library.[31]\n" +
                "\n" +
                "Guido van Rossum began working on Python in the late 1980s, as a successor to the ABC programming language, and first released it in 1991 as Python 0.9.0.[32] Python 2.0 was released in 2000 and introduced new features, such as list comprehensions and a garbage collection system using reference counting. Python 3.0 was released in 2008 and was a major revision of the language that is not completely backward-compatible and much Python 2 code does not run unmodified on Python 3. Python 2 was discontinued with version 2.7.18 in 2020" +
                "History\n" +
                "\n" +
                "Guido van Rossum at OSCON 2006\n" +
                "Main article: History of Python\n" +
                "Python was conceived in the late 1980s[39] by Guido van Rossum at Centrum Wiskunde & Informatica (CWI) in the Netherlands as a successor to ABC programming language, which was inspired by SETL,[40] capable of exception handling and interfacing with the Amoeba operating system.[10] Its implementation began in December 1989.[41] Van Rossum shouldered sole responsibility for the project, as the lead developer, until 12 July 2018, when he announced his \"permanent vacation\" from his responsibilities as Python's Benevolent Dictator For Life, a title the Python community bestowed upon him to reflect his long-term commitment as the project's chief decision-maker.[42] In January 2019, active Python core developers elected a 5-member \"Steering Council\" to lead the project.[43] As of 2021, the current members of this council are Barry Warsaw, Brett Cannon, Carol Willing, Thomas Wouters, and Pablo Galindo Salgado.[44]\n" +
                "\n" +
                "Python 2.0 was released on 16 October 2000, with many major new features, including a cycle-detecting garbage collector and support for Unicode.[45]\n" +
                "\n" +
                "Python 3.0 was released on 3 December 2008. It was a major revision of the language that is not completely backward-compatible.[46] Many of its major features were backported to Python 2.6.x[47] and 2.7.x version series. Releases of Python 3 include the 2to3 utility, which automates (at least partially) the translation of Python 2 code to Python 3.[48]\n" +
                "\n" +
                "Python 2.7's end-of-life date was initially set at 2015 then postponed to 2020 out of concern that a large body of existing code could not easily be forward-ported to Python 3.[49][50] No more security patches or other improvements will be released for it.[51][52] With Python 2's end-of-life, only Python 3.6.x[53] and later are supported.\n" +
                "\n" +
                "Python 3.9.2 and 3.8.8 were expedited[54] as all versions of Python (including 2.7[55]) had security issues, leading to possible remote code execution[56] and web cache poisoning.[57]\n" +
                "\n" +
                "Design philosophy and features\n" +
                "Python is a multi-paradigm programming language. Object-oriented programming and structured programming are fully supported, and many of its features support functional programming and aspect-oriented programming (including by metaprogramming[58] and metaobjects (magic methods)).[59] Many other paradigms are supported via extensions, including design by contract[60][61] and logic programming.[62]\n" +
                "\n" +
                "Python uses dynamic typing and a combination of reference counting and a cycle-detecting garbage collector for memory management.[63] It also features dynamic name resolution (late binding), which binds method and variable names during program execution.\n" +
                "\n" +
                "Python's design offers some support for functional programming in the Lisp tradition. It has filter,mapandreduce functions; list comprehensions, dictionaries, sets, and generator expressions.[64] The standard library has two modules (itertools and functools) that implement functional tools borrowed from Haskell and Standard ML.[65]\n" +
                "\n" +
                "The language's core philosophy is summarized in the document The Zen of Python (PEP 20), which includes aphorisms such as:[66]\n" +
                "\n" +
                "Beautiful is better than ugly.\n" +
                "Explicit is better than implicit.\n" +
                "Simple is better than complex.\n" +
                "Complex is better than complicated.\n" +
                "Readability counts.\n" +
                "Rather than having all of its functionality built into its core, Python was designed to be highly extensible (with modules). This compact modularity has made it particularly popular as a means of adding programmable interfaces to existing applications. Van Rossum's vision of a small core language with a large standard library and easily extensible interpreter stemmed from his frustrations with ABC, which espoused the opposite approach.[39]\n" +
                "\n" +
                "Python strives for a simpler, less-cluttered syntax and grammar while giving developers a choice in their coding methodology. In contrast to Perl's \"there is more than one way to do it\" motto, Python embraces a \"there should be one— and preferably only one —obvious way to do it\" design philosophy.[66] Alex Martelli, a Fellow at the Python Software Foundation and Python book author, writes that \"To describe something as 'clever' is not considered a compliment in the Python culture.\"[67]\n" +
                "\n" +
                "Python's developers strive to avoid premature optimization, and reject patches to non-critical parts of the CPython reference implementation that would offer marginal increases in speed at the cost of clarity.[68] When speed is important, a Python programmer can move time-critical functions to extension modules written in languages such as C, or use PyPy, a just-in-time compiler. Cython is also available, which translates a Python script into C and makes direct C-level API calls into the Python interpreter.\n" +
                "\n" +
                "An important goal of Python's developers is keeping it fun to use. This is reflected in the language's name—a tribute to the British comedy group Monty Python[69]—and in occasionally playful approaches to tutorials and reference materials, such as examples that refer to spam and eggs (from a famous Monty Python sketch) instead of the standard foo and bar.[70][71]\n" +
                "\n" +
                "A common neologism in the Python community is pythonic, which can have a wide range of meanings related to program style. To say that code is pythonic is to say that it uses Python idioms well, that it is natural or shows fluency in the language, that it conforms with Python's minimalist philosophy and emphasis on readability. In contrast, code that is difficult to understand or reads like a rough transcription from another programming language is called unpythonic.[72][73]\n" +
                "\n" +
                "Users and admirers of Python, especially those considered knowledgeable or experienced, are often referred to as Pythonistas.[74][75]\n" +
                "\n" +
                "Syntax and semantics\n" +
                "Main article: Python syntax and semantics\n" +
                "Python is meant to be an easily readable language. Its formatting is visually uncluttered, and it often uses English keywords where other languages use punctuation. Unlike many other languages, it does not use curly brackets to delimit blocks, and semicolons after statements are allowed but are rarely, if ever, used. It has fewer syntactic exceptions and special cases than C or Pascal.[76]\n" +
                "\n" +
                "Indentation\n" +
                "Main article: Python syntax and semantics § Indentation\n" +
                "Python uses whitespace indentation, rather than curly brackets or keywords, to delimit blocks. An increase in indentation comes after certain statements; a decrease in indentation signifies the end of the current block.[77] Thus, the program's visual structure accurately represents the program's semantic structure.[2] This feature is sometimes termed the off-side rule, which some other languages share, but in most languages indentation doesn't have any semantic meaning. The recommended indent size is four spaces.[78]\n" +
                "\n" +
                "Statements and control flow\n" +
                "Python's statements include (among others):\n" +
                "\n" +
                "The assignment statement, using a single equals sign =.\n" +
                "The if statement, which conditionally executes a block of code, along with else and elif (a contraction of else-if).\n" +
                "The for statement, which iterates over an iterable object, capturing each element to a local variable for use by the attached block.\n" +
                "The while statement, which executes a block of code as long as its condition is true.\n" +
                "The try statement, which allows exceptions raised in its attached code block to be caught and handled by except clauses; it also ensures that clean-up code in a finally block will always be run regardless of how the block exits.\n" +
                "The raise statement, used to raise a specified exception or re-raise a caught exception.\n" +
                "The class statement, which executes a block of code and attaches its local namespace to a class, for use in object-oriented programming.\n" +
                "The def statement, which defines a function or method.\n" +
                "The with statement, which encloses a code block within a context manager (for example, acquiring a lock before the block of code is run and releasing the lock afterwards, or opening a file and then closing it), allowing resource-acquisition-is-initialization (RAII)-like behavior and replaces a common try/finally idiom.[79]\n" +
                "The break statement, exits from a loop.\n" +
                "The continue statement, skips this iteration and continues with the next item.\n" +
                "The del statement, removes a variable, which means the reference from the name to the value is deleted and trying to use that variable will cause an error. A deleted variable can be reassigned.\n" +
                "The pass statement, which serves as a NOP. It is syntactically needed to create an empty code block.\n" +
                "The assert statement, used during debugging to check for conditions that should apply.\n" +
                "The yield statement, which returns a value from a generator function and yield is also an operator. This form is used to implement coroutines.\n" +
                "The return statement, used to return a value from a function.\n" +
                "The import statement, which is used to import modules whose functions or variables can be used in the current program.\n" +
                "The assignment statement (=) operates by binding a name as a reference to a separate, dynamically-allocated object. Variables may be subsequently rebound at any time to any object. In Python, a variable name is a generic reference holder and doesn't have a fixed data type associated with it. However at a given time, a variable will refer to some object, which will have a type. This is referred to as dynamic typing and is contrasted with statically-typed programming languages, where each variable may only contain values of a certain type.\n" +
                "\n" +
                "Python does not support tail call optimization or first-class continuations, and, according to Guido van Rossum, it never will.[80][81] However, better support for coroutine-like functionality is provided, by extending Python's generators.[82] Before 2.5, generators were lazy iterators; information was passed unidirectionally out of the generator. From Python 2.5, it is possible to pass information back into a generator function, and from Python 3.3, the information can be passed through multiple stack levels.[83]\n" +
                "\n" +
                "Expressions\n" +
                "Some Python expressions are similar to those found in languages such as C and Java, while some are not:\n" +
                "\n" +
                "Addition, subtraction, and multiplication are the same, but the behavior of division differs. There are two types of divisions in Python. They are floor division (or integer division) // and floating-point/division.[84] Python also uses the ** operator for exponentiation.\n" +
                "From Python 3.5, the new @ infix operator was introduced. It is intended to be used by libraries such as NumPy for matrix multiplication.[85][86]\n" +
                "From Python 3.8, the syntax :=, called the 'walrus operator' was introduced. It assigns values to variables as part of a larger expression.[87]\n" +
                "In Python, == compares by value, versus Java, which compares numerics by value[88] and objects by reference.[89] (Value comparisons in Java on objects can be performed with the equals() method.) Python's is operator may be used to compare object identities (comparison by reference). In Python, comparisons may be chained, for example a <= b <= c.\n" +
                "Python uses the words and, or, not for its boolean operators rather than the symbolic &&, ||, ! used in Java and C.\n" +
                "Python has a type of expression termed a list comprehension as well as a more general expression termed a generator expression.[64]\n" +
                "Anonymous functions are implemented using lambda expressions; however, these are limited in that the body can only be one expression.\n" +
                "Conditional expressions in Python are written as x if c else y[90] (different in order of operands from the c ? x : y operator common to many other languages).\n" +
                "Python makes a distinction between lists and tuples. Lists are written as [1, 2, 3], are mutable, and cannot be used as the keys of dictionaries (dictionary keys must be immutable in Python). Tuples are written as (1, 2, 3), are immutable and thus can be used as the keys of dictionaries, provided all elements of the tuple are immutable. The + operator can be used to concatenate two tuples, which does not directly modify their contents, but rather produces a new tuple containing the elements of both provided tuples. Thus, given the variable t initially equal to (1, 2, 3), executing t = t + (4, 5) first evaluates t + (4, 5), which yields (1, 2, 3, 4, 5), which is then assigned back to t, thereby effectively \"modifying the contents\" of t, while conforming to the immutable nature of tuple objects. Parentheses are optional for tuples in unambiguous contexts.[91]\n" +
                "Python features sequence unpacking wherein multiple expressions, each evaluating to anything that can be assigned to (a variable, a writable property, etc.), are associated in an identical manner to that forming tuple literals and, as a whole, are put on the left-hand side of the equal sign in an assignment statement. The statement expects an iterable object on the right-hand side of the equal sign that produces the same number of values as the provided writable expressions when iterated through and will iterate through it, assigning each of the produced values to the corresponding expression on the left.[92]\n" +
                "Python has a \"string format\" operator %. This functions analogously to printf format strings in C, e.g. \"spam=%s eggs=%d\" % (\"blah\", 2) evaluates to \"spam=blah eggs=2\". In Python 3 and 2.6+, this was supplemented by the format() method of the str class, e.g. \"spam={0} eggs={1}\".format(\"blah\", 2). Python 3.6 added \"f-strings\": blah = \"blah\"; eggs = 2; f'spam={blah} eggs={eggs}'.[93]\n" +
                "Strings in Python can be concatenated, by \"adding\" them (same operator as for adding integers and floats). E.g. \"spam\" + \"eggs\" returns \"spameggs\". Even if your strings contain numbers, they are still added as strings rather than integers. E.g. \"2\" + \"2\" returns \"22\".\n" +
                "Python has various kinds of string literals:\n" +
                "Strings delimited by single or double quote marks. Unlike in Unix shells, Perl and Perl-influenced languages, single quote marks and double quote marks function identically. Both kinds of string use the backslash (\\) as an escape character. String interpolation became available in Python 3.6 as \"formatted string literals\".[93]\n" +
                "Triple-quoted strings, which begin and end with a series of three single or double quote marks. They may span multiple lines and function like here documents in shells, Perl and Ruby.\n" +
                "Raw string varieties, denoted by prefixing the string literal with an r. Escape sequences are not interpreted; hence raw strings are useful where literal backslashes are common, such as regular expressions and Windows-style paths. Compare \"@-quoting\" in C#.\n" +
                "Python has array index and array slicing expressions on lists, denoted as a[key], a[start:stop] or a[start:stop:step]. Indexes are zero-based, and negative indexes are relative to the end. Slices take elements from the start index up to, but not including, the stop index. The third slice parameter, called step or stride, allows elements to be skipped and reversed. Slice indexes may be omitted, for example a[:] returns a copy of the entire list. Each element of a slice is a shallow copy.\n" +
                "In Python, a distinction between expressions and statements is rigidly enforced, in contrast to languages such as Common Lisp, Scheme, or Ruby. This leads to duplicating some functionality. For example:\n" +
                "\n" +
                "List comprehensions vs. for-loops\n" +
                "Conditional expressions vs. if blocks\n" +
                "The eval() vs. exec() built-in functions (in Python 2, exec is a statement); the former is for expressions, the latter is for statements.\n" +
                "Statements cannot be a part of an expression, so list and other comprehensions or lambda expressions, all being expressions, cannot contain statements. A particular case of this is that an assignment statement such as a = 1 cannot form part of the conditional expression of a conditional statement. This has the advantage of avoiding a classic C error of mistaking an assignment operator = for an equality operator == in conditions: if (c = 1) { ... } is syntactically valid (but probably unintended) C code but if c = 1: ... causes a syntax error in Python.\n" +
                "\n" +
                "Methods\n" +
                "Methods on objects are functions attached to the object's class; the syntax instance.method(argument) is, for normal methods and functions, syntactic sugar for Class.method(instance, argument). Python methods have an explicit self parameter to access instance data, in contrast to the implicit self (or this) in some other object-oriented programming languages (e.g., C++, Java, Objective-C, or Ruby).[94]\n" +
                "\n" +
                "Typing\n" +
                "\n" +
                "The standard type hierarchy in Python 3\n" +
                "Python uses duck typing and has typed objects but untyped variable names. Type constraints are not checked at compile time; rather, operations on an object may fail, signifying that the given object is not of a suitable type. Despite being dynamically-typed, Python is strongly-typed, forbidding operations that are not well-defined (for example, adding a number to a string) rather than silently attempting to make sense of them.\n" +
                "\n" +
                "Python allows programmers to define their own types using classes, which are most often used for object-oriented programming. New instances of classes are constructed by calling the class (for example, SpamClass() or EggsClass()), and the classes are instances of the metaclass type (itself an instance of itself), allowing metaprogramming and reflection.\n" +
                "\n" +
                "Before version 3.0, Python had two kinds of classes: old-style and new-style.[95] The syntax of both styles is the same, the difference being whether the class object is inherited from, directly or indirectly (all new-style classes inherit from object and are instances of type). In versions of Python 2 from Python 2.2 onwards, both kinds of classes can be used. Old-style classes were eliminated in Python 3.0.\n" +
                "\n" +
                "The long-term plan is to support gradual typing[96] and from Python 3.5, the syntax of the language allows specifying static types but they are not checked in the default implementation, CPython. An experimental optional static type checker named mypy supports compile-time type checking","Java (programming language)\n" +
                "From Wikipedia, the free encyclopedia\n" +
                "Jump to navigationJump to search\n" +
                "\"Java language\" redirects here. It is not to be confused with Javanese language.\n" +
                "Not to be confused with JavaScript.\n" +
                "Java\n" +
                "Java programming language logo.svg\n" +
                "Paradigm\tMulti-paradigm: generic, object-oriented (class-based), imperative, reflective\n" +
                "Designed by\tJames Gosling\n" +
                "Developer\tOracle Corporation\n" +
                "First appeared\tMay 23, 1995; 26 years ago[1]\n" +
                "Stable release\t\n" +
                "Java SE 16.0.1 / April 20, 2021; 2 months ago\n" +
                "Typing discipline\tStatic, strong, safe, nominative, manifest\n" +
                "Filename extensions\t.java, .class, .jar\n" +
                "Website\toracle.com/java/ java.com\n" +
                "Influenced by\n" +
                "CLU,[2] Simula67,[2] Lisp,[2] Smalltalk,[2] Ada 83, C++,[3] C#,[4] Eiffel,[5] Mesa,[6] Modula-3,[7] Oberon,[8] Objective-C,[9] UCSD Pascal,[10][11] Object Pascal[12]\n" +
                "Influenced\n" +
                "Ada 2005, BeanShell, C#, Chapel,[13] Clojure, ECMAScript, Fantom, Gambas,[14] Groovy, Hack,[15] Haxe, J#, Kotlin, PHP, Python, Scala, Seed7, Vala, JavaScript\n" +
                " Java Programming at Wikibooks\n" +
                "Java is a high-level, class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible. It is a general-purpose programming language intended to let application developers write once, run anywhere (WORA),[16] meaning that compiled Java code can run on all platforms that support Java without the need for recompilation.[17] Java applications are typically compiled to bytecode that can run on any Java virtual machine (JVM) regardless of the underlying computer architecture. The syntax of Java is similar to C and C++, but has fewer low-level facilities than either of them. The Java runtime provides dynamic capabilities (such as reflection and runtime code modification) that are typically not available in traditional compiled languages. As of 2019, Java was one of the most popular programming languages in use according to GitHub,[18][19] particularly for client-server web applications, with a reported 9 million developers.[20]\n" +
                "\n" +
                "Java was originally developed by James Gosling at Sun Microsystems (which has since been acquired by Oracle) and released in 1995 as a core component of Sun Microsystems' Java platform. The original and reference implementation Java compilers, virtual machines, and class libraries were originally released by Sun under proprietary licenses. As of May 2007, in compliance with the specifications of the Java Community Process, Sun had relicensed most of its Java technologies under the GNU General Public License. Oracle offers its own HotSpot Java Virtual Machine, however the official reference implementation is the OpenJDK JVM which is free open source software and used by most developers and is the default JVM for almost all Linux distributions.\n" +
                "\n" +
                "As of March 2021, the latest version is Java 16, with Java 11, a currently supported long-term support (LTS) version, released on September 25, 2018. Oracle released the last zero-cost public update for the legacy version Java 8 LTS in January 2019 for commercial use, although it will otherwise still support Java 8 with public updates for personal use indefinitely. Other vendors have begun to offer zero-cost builds of OpenJDK 8 and 11 that are still receiving security and other upgrades.\n" +
                "\n" +
                "Oracle (and others) highly recommend uninstalling outdated versions of Java because of serious risks due to unresolved security issues.[21] Since Java 9, 10, 12, 13, 14, and 15 are no longer supported, Oracle advises its users to immediately transition to the latest version (currently Java 16) or an LTS release." +
                "History\n" +
                "See also: Java (software platform) § History\n" +
                "\n" +
                "Duke, the Java mascot\n" +
                "\n" +
                "James Gosling, the creator of Java, in 2008\n" +
                "\n" +
                "The TIOBE programming language popularity index graph from 2002 to 2018. Java was steadily on the top from mid-2015 to early 2020.\n" +
                "James Gosling, Mike Sheridan, and Patrick Naughton initiated the Java language project in June 1991.[22] Java was originally designed for interactive television, but it was too advanced for the digital cable television industry at the time.[23] The language was initially called Oak after an oak tree that stood outside Gosling's office. Later the project went by the name Green and was finally renamed Java, from Java coffee, a type of coffee from Indonesia.[24] Gosling designed Java with a C/C++-style syntax that system and application programmers would find familiar.[25]\n" +
                "\n" +
                "Sun Microsystems released the first public implementation as Java 1.0 in 1996.[26] It promised Write Once, Run Anywhere (WORA) functionality, providing no-cost run-times on popular platforms. Fairly secure and featuring configurable security, it allowed network- and file-access restrictions. Major web browsers soon incorporated the ability to run Java applets within web pages, and Java quickly became popular. The Java 1.0 compiler was re-written in Java by Arthur van Hoff to comply strictly with the Java 1.0 language specification.[27] With the advent of Java 2 (released initially as J2SE 1.2 in December 1998 – 1999), new versions had multiple configurations built for different types of platforms. J2EE included technologies and APIs for enterprise applications typically run in server environments, while J2ME featured APIs optimized for mobile applications. The desktop version was renamed J2SE. In 2006, for marketing purposes, Sun renamed new J2 versions as Java EE, Java ME, and Java SE, respectively.\n" +
                "\n" +
                "In 1997, Sun Microsystems approached the ISO/IEC JTC 1 standards body and later the Ecma International to formalize Java, but it soon withdrew from the process.[28][29][30] Java remains a de facto standard, controlled through the Java Community Process.[31] At one time, Sun made most of its Java implementations available without charge, despite their proprietary software status. Sun generated revenue from Java through the selling of licenses for specialized products such as the Java Enterprise System.\n" +
                "\n" +
                "On November 13, 2006, Sun released much of its Java virtual machine (JVM) as free and open-source software (FOSS), under the terms of the GNU General Public License (GPL). On May 8, 2007, Sun finished the process, making all of its JVM's core code available under free software/open-source distribution terms, aside from a small portion of code to which Sun did not hold the copyright.[32]\n" +
                "\n" +
                "Sun's vice-president Rich Green said that Sun's ideal role with regard to Java was as an evangelist.[33] Following Oracle Corporation's acquisition of Sun Microsystems in 2009–10, Oracle has described itself as the steward of Java technology with a relentless commitment to fostering a community of participation and transparency.[34] This did not prevent Oracle from filing a lawsuit against Google shortly after that for using Java inside the Android SDK (see the Android section).\n" +
                "\n" +
                "On April 2, 2010, James Gosling resigned from Oracle.[35]\n" +
                "\n" +
                "In January 2016, Oracle announced that Java run-time environments based on JDK 9 will discontinue the browser plugin.[36]\n" +
                "\n" +
                "Java software runs on everything from laptops to data centers, game consoles to scientific supercomputers.[37]\n" +
                "\n" +
                "Principles\n" +
                "There were five primary goals in the creation of the Java language:[17]\n" +
                "\n" +
                "It must be simple, object-oriented, and familiar.\n" +
                "It must be robust and secure.\n" +
                "It must be architecture-neutral and portable.\n" +
                "It must execute with high performance.\n" +
                "It must be interpreted, threaded, and dynamic.","C","C++","JavaScript","HTML","ReactJS"};

        listview=findViewById(R.id.list);

        // now we need a Adapter(ArrayAdapter(for arrays)) to tranfer the array in the listview format.
        /*
        here (1).ArrayAdapter is the class.
             (2). arrayAdapter is the object of ArrayAdapter class.
             (3). ArrayAdapter() is a parameterized Constructor.
         */

        ArrayAdapter arrayAdapter=new ArrayAdapter(this, android.R.layout.simple_list_item_1,data);
        listview.setAdapter(arrayAdapter);//now setting the adapter to work on the listview and the array.

        // Now setting setOnItemClickListener to get a response(through toast) by clicking the particular item of the listview.
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {//position gives the position of the item from the array that is clicked by the user.
                Toast.makeText(MainActivity.this,"you clicked on "+data[position],Toast.LENGTH_SHORT).show();

                String langinfo=info[position];//now storing the value the the clicked list item.
                Intent intent=new Intent(MainActivity.this,display.class);//creating the intent to display the content on clicking the item of the list view.
                intent.putExtra(send,langinfo);//sending the data from this activity to the another activity(screen)
                startActivity(intent);//now using the startActivity function to starting work of the intent.
            }
        });
    }
}