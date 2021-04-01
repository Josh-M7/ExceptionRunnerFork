Tasks to answer in your own README.md that you submit on Canvas:

1.  See logger.log, why is it different from the log to console?
	A) It is different from the log to the console because it contains 2 additional lines. The lines start with FINER, which is not in the ones to the console. Also the file is different than the console because it is stored in a file and not kept in the console, which may be deleted.
1.  Where does this line come from? FINER org.junit.jupiter.engine.execution.ConditionEvaluator logResult Evaluation of condition [org.junit.jupiter.engine.extension.DisabledCondition] resulted in: ConditionEvaluationResult [enabled = true, reason = '@Disabled is not present']
	A) It comes from the JUnit class after checking to see if the Test is disabled or not.
1.  What does Assertions.assertThrows do?
	A) It asserts that a certain exception is thrown while running a method.
1.  See TimerException and there are 3 questions
    1.  What is serialVersionUID and why do we need it? (please read on Internet)
		A) It is a unique identifier for serializable classes and is used during deserialization to make sure that both sender and receiver have loaded classes that are compatible with respect to serialization. Specifying it is good, because the default one is sensitive to compiler implementations and can be inconsistent.
    2.  Why do we need to override constructors?
		A) We need to override constructors because we want to preserve the original exceptions, if any, that are thrown as a cause, be able to use a custom message, and since the custom exception class is unique, then it needs to have those constructor methods. 
    3.  Why we did not override other Exception methods?	
		A) We did not override the other Exception methods because they do not need to be overriden in order to make an Exception class and are safe to use as inherited.
1.  The Timer.java has a static block static {}, what does it do? (determine when called by debugger)
	A) Everything in the static method will exist outside of individual instances of that class. In this case, the Logger information will always appear.
1.  What is README.md file format how is it related to bitbucket? (https://confluence.atlassian.com/bitbucketserver/markdown-syntax-guide-776639995.html)
	A) .md stands for Markdown which is a type of formating language used by many different sources to give formatted text, that isn't space heavy. Bitbucket uses it to display formatted text to the screen in the repository.
1.  Why is the test failing? what do we need to change in Timer? (fix that all tests pass and describe the issue)
	A) The test was failing because Long timeNow was declared as Null, which resulted in a NullPointerException. We just need to initialize the timeNow to be the same as System.currentTimeMillis instead of null.
1.  What is the actual issue here, what is the sequence of Exceptions and handlers (debug)
	A) When timeNow is returned, it would have been null in this case. The reason it is not a TimerException is because the timer exception that is throw is caught inside of the method. So it doesn't make it outside of the method. Also, the NullPointerException is thrown after the TimerException, therefore being the first one that would be caught after leaving the function.
1.  Make a printScreen of your eclipse JUnit5 plugin run (JUnit window at the bottom panel)
	A) In folder with rest of information.
1.  Make a printScreen of your eclipse Maven test run, with console
	A) In folder with rest of information.
1.  What category of Exceptions is TimerException and what is NullPointerException
	A) TimerException is an IllegalArgumentException. NullPointerException is an invalid use of a null reference.
1.  Push the updated/fixed source code to your own repository.
	A) Pushed to Github. Link to repo - https://github.com/Josh-M7/ExceptionRunnerFork
