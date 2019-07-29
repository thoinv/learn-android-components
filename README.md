# Live Data

![Live Data Model](https://image.prntscr.com/image/oUlpvMRXRPiSBMVsTQ3ZPw.png)

## Advantages 
- Ensures your UI matches your data state - follows the observer pattern.
- No memory leaks
- No crashes due to stopped activities
- No more manual lifecycle handling - automatically manages all of this since it’s aware of the relevant lifecycle status changes while observing.
- Always up to date data
- Proper configuration changes
- Sharing resources 
+  using the singleton pattern to wrap system services so that they can be shared in your app
+ The LiveData object connects to the system service once, and then any observer that needs the resource can just watch the LiveData object

## Disadvantage
- LiveData does not come with a toolkit for combining streams of data or managing threads, like Rx does.
