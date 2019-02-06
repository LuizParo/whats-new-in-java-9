javac --module-source-path academy.learnprogramming.jokeapp.ui/src -d out $(find . -name '*.java')
javac --module-source-path academy.learnprogramming.jokeserver/src -d out $(find . -name '*.java')
javac --module-source-path academy.learnprogramming.jokeserver.kid/src -d out $(find . -name '*.java')
javac --module-source-path academy.learnprogramming.jokeserver.programmer/src -d out $(find . -name '*.java')