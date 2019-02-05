module academy.learnprogramming.jokeserver.kid {
    requires academy.learnprogramming.jokeserver;

    provides academy.learnprogramming.jokeserver.JokeServer
            with academy.learnprogramming.jokeserver.kid.KidJokeServer;
}