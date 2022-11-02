******* Конструкция try-with-resources *******

Конструкцию try-with-resources ввели в Java 7. Она дает возможность объявлять
один или несколько ресурсов в блоке try, которые будут закрыты автоматически
без использования finally блока.

В качестве ресурса можно использовать любой объект, класс которого реализует
интерфейс java.lang.AutoCloseable или java.io.Closable.

-----------------------------------------------------------------------------------
From https://www.geeksforgeeks.org/try-with-resources-feature-in-java/

In Java, the Try-with-resources statement is a try statement that declares one
or more resources in it. A resource is an object that must be closed once your
program is done using it. For example, a File resource or a Socket connection
resource.

The try-with-resources statement ensures that each resource is closed at the end
of the statement execution. If we don’t close the resources, it may constitute a
resource leak and also the program could exhaust the resources available to it.

You can pass any object as a resource that implements java.lang.AutoCloseable,
which includes all objects which implement java.io.Closeable.

By this, now we don’t need to add an extra finally block for just passing the
closing statements of the resources. The resources will be closed as soon as the
try-catch block is executed.

Syntax: Try-with-resources
---------------------------------------------------------------------------------
try(declare resources here) {
    // use resources
}
catch(FileNotFoundException e) {
    // exception handling
}
---------------------------------------------------------------------------------

Exceptions:
When it comes to exceptions, there is a difference in try-catch-finally block and
try-with-resources block. If an exception is thrown in both try block and finally
block, the method returns the exception thrown in finally block.

For try-with-resources, if an exception is thrown in a try block and in a
try-with-resources statement, then the method returns the exception thrown in the
try block. The exceptions thrown by try-with-resources are suppressed,
i.e. we can say that try-with-resources block throws suppressed exceptions.