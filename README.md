# fibFun
<ul>
    <li>
        The max fib number can be calculated on Java is 15677. Any number bigger than 15677 will cause Java BigInt overflow.
        <ul>
            <li>I created fibValueTestBuilder.java under \src\test\java\com\example\fib to find out this Java BigInt limitation </li>
        </ul>
    </li>
    <li>
        Computing all Fib number up to 15677 takes 22ms on the first time, 7-9ms rest of the time.
        <ul>
            <li>I precompute all fib number up to 15677 on application startup and store it in an umodifiable list. </li>
            <li>This approach has no foreseeable concerns on </li>
            <ul>
                <li>i. concurrent issues: The write operation will only perform once at the application initialization. </li>
                <li>ii. performance issues: every query the clients request will consume O(1) constant time. </li>
            </ul>
            <li>This approach seperates reads and writes. It's like CQRS pattern (Command Query Responsibility Segregation) </li>
        </ul>
    </li>
    <li>Created a simple security layer using basic authentication. (Would have used OAuth2 if time permits)
        <ul>
            <li>admin role: admin/password</li>
            <li>user role: user/password</li>
        </ul>
    </li>
</ul>
