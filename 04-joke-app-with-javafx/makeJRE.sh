rm -rf out/jre
$JAVA_HOME/bin/jlink \
    --module-path $JAVA_HOME/jmods:out/production \
    --add-modules academy.learnprogramming.jokeapp.ui \
    --launcher JOKER=academy.learnprogramming.jokeapp.ui/academy.learnprogramming.jokeapp.ui.Main \
    --output out/jre