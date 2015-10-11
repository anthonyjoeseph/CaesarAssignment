CS542 Design Patterns
Spring 2011
PROJECT 2 README FILE

Due Date: Sunday, October 11 2015
Submission Date: Sunday, October 11 2015
Grace Period Used This Project: 0 Days
Grace Period Remaining: 3 Days
Author(s): Anthony Stella and Anthony Gabriele
e-mail(s): astella1@binghamton.edu and agabrie5@binghamton.edu


PURPOSE:

To decrypt text documents encrypted by a caesar cipher using multiple threads.

PERCENT COMPLETE:

[
We believe we have completed 100% of this project.

PARTS THAT ARE NOT COMPLETE:

No parts are incomplete.

BUGS:

There are no bugs.

FILES:

  Included with this project are 11 files:

  CaesarCipherI.java, The interface defining how to interact with CaesarDectypt
  CaesarDecrypt.java, The model that actually decrypts strings encoded with the caesar cipher
  CreateWorkers.java, Creates the threads that will decrypt strings
  ThreadedDecrypter.java, Defines what how one of these threads will behave
  Driver.java, Interfaces with the user and uses our model
  DecodedStore.java, Handles storing the decoded texts and writing them to a file
  DisplayI.java, Defines how to interact with DecodedStore
  FileProcessor.java, Handles reading a given file line by line
  Logger.java, Defines functionality that helps debug threaded code
  Build.xml, the ANT build file containing the arguments necessary to print the file
  README, the text file you are presently reading
]

SAMPLE OUTPUT:

g7-27:~/cs542/anthony_gabriele_assign2/caesarCipher/src> ant run
Buildfile: /import/linux/home/agabrie5/cs542/anthony_gabriele_assign2/caesarCipher/src/build.xml

jar:

run:
     [java] FileNotFoundException: inputFile.txt (No such file or directory)
     [java] Make sure the file name is valid and that the file is located in the directory you are executing from
     [java] Java Result: 1

BUILD SUCCESSFUL
Total time: 1 second
g7-27:~/cs542/anthony_gabriele_assign2/caesarCipher/src> 

TO COMPILE:

from the directory anthony_gabriele_assign2/caesarCipher/src
run this command: "ant"

TO RUN:

add a file called "inputFile.txt" to the directory anthony_gabriele_assign2/caesarCipher/
from the directory anthony_gabriele_assign2/caesarCipher/src
run this command: "ant run"

EXTRA CREDIT:

N/A

BIBLIOGRAPHY:

Anthony Stella
Anthony Gabriele


ACKNOWLEDGEMENT:

None.
