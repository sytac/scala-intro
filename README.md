# scala-intro
Exercises for introduction to Scala


###Run the tests
Exercises are verified by tests associated with each class in `src` folder.
To run all test, first start sbt (make sure [sbt is installed](http://www.scala-sbt.org/release/docs/Setup.html) and visible on your path):

```
sbt
```

 and once you are in the console, to run all the associated tests:

```
> test
```

and to run a specific test class, e.g. `part1.ExpressionsTest`

```
> test-only part1.ExpressionsTest
```

_TIP_: you can run continuously all the tests, or just a test class by prepending the `test` command with a `~`. SBT will listen to code changes, build incrementally the code and rerun the tests automatically:

```
> ~test-only part1.ExpressionsTest
```
