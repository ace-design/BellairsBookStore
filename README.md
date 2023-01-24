# Book Store

## About

 * The bookstore indexes books by ISBN. A book is only known to the bookstore if it has been indexed.  
 All indexed books have:
   * A price in CAD
   * A title
   * An author
   * An abstract / description
 * The bookstore chain has agencies in different cities.
   * There can not be two agencies in the same city
   * Each city has a stock, that tells the amount in store for the indexed books.
 * The bookstore chain stores reader feedback for books (comments)
   * Comments are anonymous and have no author
   * Only indexed books can be commented
   * Comments can be updated
   * Comments must not be empty

## Usage

On execution, the bookstore will simply print a listing of persisted initial dummy data.

 1. Get the sources:  
```git clone https://github.com/kartoffelquadrat/BookStoreInternals.git```

 2. Compile the project with maven. This provides you with a self contained ```jar``` in the ```target```folder:  
```javac sources/eu/kartoffelquadrat/bookstoreinternals/*.java```
 
 3. Run the jar:  
 ```java -cp sources eu.kartoffelquadrat.bookstoreinternals.DesktopLauncher```

## Invokation

If you want to use the bookstore as dependency:


## Contact / Pull Requests

 * Author: Maximilian Schiedermeier ![email](email.png)
 * Github: m5c
 * Webpage: https://www.cs.mcgill.ca/~mschie3
 * License: [MIT](https://opensource.org/licenses/MIT)

