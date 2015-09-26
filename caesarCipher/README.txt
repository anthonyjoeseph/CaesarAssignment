Assuming you are in the directory containing this README:

## To clean:
ant -buildfile src/build.xml clean

## To compile: 
ant -buildfile src/build.xml all

## To run without specifying args in build.xml
ant -buildfile src/build.xml run <args>

## To run by specifying args in build.xml
ant -buildfile src/build.xml run b

## To create tarball for submission
ant -buildfile src/build.xml tarzip


