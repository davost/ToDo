package se.lexicon.dao.sequencer;

public class PersonIdSequencer {
    //the sources I am reading online, like Oracle, are calling sequencers an interface, but it used as a
    //class in the example
    private static int sequencer = 0;
    public static int nextId() {return ++sequencer;}
}
