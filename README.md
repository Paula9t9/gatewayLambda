# Gateway and Lambda

This is a lambda function used in conjunction with an API Gateway to find the repeated word in a sentence. 

To use it, visit [this website](https://g52p96cylk.execute-api.us-east-2.amazonaws.com/repeatedWord/) and paste

    ?sentence=Your sentence here
    
* Don't use "quotes", spaces are okay.

If a word was repeated, it will be returned to you. If no repeats were found, it will return an empty string. 



The trickiest thing for implementing this api gateway was making sure we were passing our function what it wanted. Previous demos called for json objects, but our function wanted a pure string. This may also be why our query doesn't like quotes. 
