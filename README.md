# Java Meal Ordering

An interactive object-oriented console exercise modelling burgers, drinks, sides, and meal customisation.

## What is implemented

Separate product classes, menu input, customisation methods, and price calculations.

## Build and run

Use JDK 23 or newer and Maven from the repository root. The Maven file is the source of truth for any lower compiler target.

~~~sh
mvn -B compile
java -cp target/classes Main
~~~

## Scope and limitations

Run in an interactive terminal. This is an OOP learning example, separate from the hexagonal-food-ordering-system architecture project. Payment processing, persistence, and stock control are outside its scope.

## Verification

See [verification notes](docs/verification.md) for the exact checks performed. A compile result is not an end-to-end test result.

Local configuration, credentials, browser drivers, generated reports, IDE metadata, and personal data are excluded from new source commits. Existing source notices are retained.