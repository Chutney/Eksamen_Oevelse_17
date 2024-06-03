import java.util.ArrayList;

public class Election {

    ArrayList<Candidate> listOfCandidates;

    public Election() {
        listOfCandidates = new ArrayList<>();
    }

    public void addCandidate(String name, String party, int numberOfVotes) {
        listOfCandidates.add(new Candidate(name, party, numberOfVotes));
    }

    public int getTotalVotes() {
        int totalVotes = 0;
        for (Candidate cand : listOfCandidates) {
            totalVotes += cand.getNumberOfVotes();
        }

        return totalVotes;
    }


    public ArrayList<Candidate> getCandidatesFromPart(String party) {
        ArrayList<Candidate> candidatesFromParty = new ArrayList<>();

        for (Candidate cand : listOfCandidates) {
            if(cand.getParty().equalsIgnoreCase(party)) {
                candidatesFromParty.add(cand);
            }

        }
        return candidatesFromParty;

    }
}
