---------------------------------------------------------------------------------
Exercise Name: Java Read from input file and write in output file

Description

This program read lines from input file and checks if the text in the line is url or not:

 1) The text is url then get the content length.
 2) put the url and content length in hashmap.
 3) not url then ignore it and check the next line.
 4) all the lines read then copy the hashmap data to the output file.

Examples and expected results:

 input file data:
 - http://cs.hac.ac.il
 - http://this_url_does_not_exists
 - https://docs.oracle.com/en/java/javase/11/docs/api/index.html
 - this is not a valid url

 output file data:
 - http://cs.hac.ac.il 14861
 - https://docs.oracle.com/en/java/javase/11/docs/api/index.html 26339

---------------------------------------------------------------------------------
