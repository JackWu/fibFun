# fibFun
<ul>
    <li>
 The max fib number can be calculated on Java is 15677. Any number bigger than 15677 will cause Java BigInt overflow.
    <ul><li>I created fibValueTestBuilder.java under \src\test\java\com\example\fib to find out this Java BigInt limitation </li></ul></li>
    <li>    
 Computing all Fib number up to 15677 takes 22ms on the first time, 7-9ms rest of the time. <br>
    <ul><li>a. I precompute all fib number up to 15677 on application startup and store it in an umodifiable list. </li>
    <li>This approach has no foreseeable concerns on <ul>
       <li>i. concurrent issues: The write operation will only perform once at the application initialization. </li>
       <li>ii. performance issues: every query the clients request will consume O(1) constant time. </li></ul></li></ul>
 </li></ul>
