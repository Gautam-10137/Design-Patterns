# Basics to make and run class in c++

<li>C++ classes (and often function prototypes) are normally split up into two files.</li>
<li>The header file has the extension of .h and contains class definitions and functions. </li>
<li>The implementation of the class goes into the .cpp file. By doing this, if your class<br>
    implementation doesn’t change then it won’t need to be recompiled. </li>
<li>Most IDE’s will do this for you – they will only recompile the classes that have changed. </li>
<li>This is possible when they are split up this way, but it isn’t possible if everything is <br>
in one file (or if the implementation is all part of the header file). 


<h1>Using #ifndef </h1>
Sometimes we can end up including a header file multiple times. C++ doesn’t like this if<br>
it ends up redefining something again. In our previous example this didn’t happen because<br>
main.cpp and Num.cpp are compiled separately so the inclusion of Num.h causes no problem.<br>
<br><br>
To compile this from the command line we would use: <br>
<b>>g++ main.cpp Vehicle.cpp <br>
>./a</b>
<br>
To fix this we can use <b>#ifndef</b>.<br>
This is called a directive as it is a message to the compiler, but not really <br>
a feature of the language. It tells the compiler to ignore what follows if it has <br>
already seen this stuff before.<br>

<b>#ifndef NUM_H<br>
#define NUM_H<br></b>
"define class or whatever else"<br>
<b>#endif </b><br>

<br>
This says if “NUM_H” is not defined, then define it. <br>
We can use any name but the recommendation is to use a name related to the class.<br> 


