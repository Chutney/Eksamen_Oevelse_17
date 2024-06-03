public class Main {

    public static void main(String[] args) {

        Election election = new Election();

        election.addCandidate("Noah Van Wagenen", "The gold party", 10);
        election.addCandidate("Paul Atreides","The gold party",20);
        election.addCandidate("Darren","The democrats", 80);

        System.out.println(election.getTotalVotes());

        for(Candidate cand : election.getCandidatesFromPart("The democrats")) {
            System.out.println(cand.toString());
        }
    }

}
