Introduction

The goal of this lab is to apply your understanding of decision and loop
    structures to implement a complex algorithm within the context of an
    unfamiliar and significant software framework (GridWorld). In addition,
    you will implement a unit test for your program using the JUnit framework
    and create documentation for your program using JavaDoc.


Requirements

Write a program that plays Conway’s Game of Life. Conway’s Game of Life is a
    cellular automaton. From Wikipedia:

The universe of the Game of Life is an infinite two-dimensional orthogonal
    grid of square cells, each of which is in one of two possible states,
    alive or dead. Every cell interacts with its eight neighbours, which are
    the cells that are horizontally, vertically, or diagonally adjacent. At
    each step in time, the following transitions occur:

* Any live cell with fewer than two live neighbours dies, as if caused by
    underpopulation.
* Any live cell with two or three live neighbours lives on to the next generation.
* Any live cell with more than three live neighbours dies, as if by overcrowding.
* Any dead cell with exactly three live neighbours becomes a live cell, as if
    by reproduction.
* The initial pattern constitutes the seed of the system. The first
    generation is created by applying the above rules simultaneously to every
    cell in the seed—births and deaths occur simultaneously, and the discrete
    moment at which this happens is sometimes called a tick (in other words,
    each generation is a pure function of the preceding one). The rules
    continue to be applied repeatedly to create further generations.


Nonfunctional Requirements:

* the program must be implemented in Java and utilize the GridWorld platform
* I recommend not use GridWorld’s execution engine to produce subsequent
    generations. It will be easier to implement the unit test if you directly
    produce and display subsequent generations.


Artifacts to Produce:

* Requirements Document: 

* The grid will be 20x20 cells. Live cells will be filled in with rocks and dead cells will be
* just white. There will be one Glider ship interacting with a mass of moving cells.
* It should run for around 75 generations.
* The time interval between generations will be about half of a second? The edges don't
* wrap around.
    
    
* Test Plan:

* I am testing for the initial state of the glider ship in the upper left corner of the grid.
* It will test for all of the cells and make sure that they are correctly dead or alive.
* 
* I am also testing for the state of the glider ship after ten generations.
* It will run the createNextGeneration method ten times and check all the cells the same as
* initial state test.
    
* GameOfLifeTest Test Class: JUnit-compatible test class that implements the
    test plan.
* GameOfLife class: You must produce a working class the meets the
    requirements and is verified and validated by your test plan.
* Reflection Document: This is a significant and challenging lab. Please
    reflect on this experience and share your feedback with me. What did you
    like or dislike and why? What was surprising or unexpected? What did you
    learn? What questions do you still have? What advice would you offer next
    year's students?


Submission:

* Ensure the following artifacts have been committed to GitHub in addition to your code:
    * requirements document
    * design document (pseudocode, flow charts, etc.)
    * test plan (with specific test cases)
    * HTML documentation generated by JavaDoc
    * reflection document
* Submit a pull request in GitHub and submit a link to the request with this assignment.
