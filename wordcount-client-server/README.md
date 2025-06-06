# Prerequisits and assumptions
- Programming language Java shall be used.
- Presume that the program shall be used for commercial purposes and write the code with
that in mind.
- No GUI (Graphical User Interface) components shall be used.

# Task
- Two (2) servers shall read and expose one text file each. (frankenstein.txt and dracula.txt)
- One (1) client shall read and count the data from the two servers in parallel. As a
suggestion the communication between server and client use sockets.
- The code should work just as well for very large files, thus do not keep entire files in
memory at any time.
- The result shall be one (1) print out of the 5 most common words in the two texts with the
total number of occurrences of the word.

-------------------------------------------------------------------------------------------------------------------------------------------------------

## Prerequisites

- **Java 8 or higher**
- **Maven** (to build the project)
- Text files (e.g., `dracula.txt` and `frankenstein.txt`) must be available in the specified resource folder or at the absolute paths provided in `Exec.java`.

## How to Build

1. Open a terminal (or command prompt) and navigate to the project root (where `pom.xml` is located).
2. Run the following command to compile the project:

   ```bash
   	mvn clean compile
   ```
   
## Expected Output (Example Session)

When you run the `Exec` class, you should see console output similar to the following:

```yaml
Servers started.
Connecting to localhost:9010
Connecting to localhost:9011
FileServer started on port 9010 serving file: <path_to_dracula.txt>
FileServer started on port 9011 serving file: <path_to_frankenstein.txt>
Top 5 most common words:
  the: 2345
  and: 1987
  of: 1567
  to: 1345
  in: 1123
Client finished processing.
FileServer on port 9010 terminating gracefully.
FileServer on port 9011 terminating gracefully.
All servers terminated. Exiting.
```

## Note:  
 The port values (9010 and 9011) are defined in the `Port` enum (located in the `common` package), where for example, `Port.DRACULA` is assigned 9010 and `Port.FRANKENSTEIN` is assigned 9011. 
 
