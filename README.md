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
```git clone https://github.com/ace-design/BookStoreInternals.git```

 2. Compile the project with javac:  
```javac sources/eu/kartoffelquadrat/bookstoreinternals/*.java```
 
 3. Run the jar:  
 ```java -cp sources eu.kartoffelquadrat.bookstoreinternals.DesktopLauncher```


## Contact / Pull Requests

 * Authors: Maximilian Schiedermeier, Sébastien Mosser
 * Github: [m5c](https://github.com/m5c) [mosser](https://github.com/mosser)
 * License: [MIT](https://opensource.org/licenses/MIT)

