# lottery-number-generator
Generate a lottery number based on the number of times a number has appeared

### Getting Data
1. Go to [https://www.thailottotipsvip.com/thai-lottery/2021](https://www.thailottotipsvip.com/thai-lottery/2021) and open all the months.
2. Open the inspector and paste the following code into the terminal:

```js
var list = [];
document.querySelectorAll(".rrm-draw-numbers-firstprize-container").forEach(function(element) {
    var spans = element.querySelectorAll("span");
    var numbers = "";
    var index = 0;
    spans.forEach(function(spanElement) {
        if(index != 0){
            numbers += spanElement.innerHTML;
        }
        index++;
    });
    list.push(numbers);
})
console.log(list);
```

3. This will provide all the list of winning numbers in the year.
4. Paste and format the numbers in the `Numbers.java` file > `setNumbers` function.