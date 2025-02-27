# Testing & Debugging

Writing code is hard. Sometimes it's not clear what exactly the output of a function should be, and there are often many edge-cases you have to think about. Could you prove the program correctness using formal logic? Maybe, but unfortunately, formal verification requires specific skills and takes a lot of time; making it scale to large programs is still am active research topic.

The simplest way to gain _some_ confidence in your code is _manual testing_: run your code yourself and look at what it does. If it feels OK, good, otherwise, go and fix it. But this does not scale to large code bases: there are too many things that the code does to remember them all, and you may forget to check some parts.

This series of exercises introduces _automated testing_: write the tests once, and automatically run them every time you want, with a clear report of which tests passed and which tests failed. No more need to remember all the edge cases yourself, or to waste time manually entering all kinds of inputs!

We will use two Java libraries: JUnit is the base testing library, and Hamcrest adds useful methods for testing. JUnit is supported by virtually all Java IDEs, which means that you can automatically run tests from an IDE and see the passed and failed tests; you can also do this from the command-line.

Some exercises will require the use of a debugger. We strongly recommend using an IDE such as IntelliJ or Android Studio so that you can get familiar with the tools you will be using in the Software Development Project.

> :warning:  These exercises are optional, and you do not need to solve them all. They are here just to help you gain practice with the areas that you feel less comfortable with.

The exercises are designed such that, if you can correctly solve the Basic exercises every week, then you should be able to get a passing grade on the exams. If you additionally solve correctly the Intermediate exercises, then you should be able to get a very good grade on the exams. The Advanced exercises are for enthusiasts who want go beyond the standard material and get a black belt in Software Engineering. We will be happy to try and provide personalized feedback on your solutions to Advanced exercises if you wish, just contact the staff.

## Exercises

- Basics
    - [Adapt the code](adapt-the-code)

- Intermediate
    - [Test driven development](test-driven-development)

## Solutions

You can find the solutions [here](solutions), but please try to solve the exercises by yourself before peeking at the solutions.
