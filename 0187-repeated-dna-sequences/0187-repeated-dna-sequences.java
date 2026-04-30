class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashMap<String, Integer> sequences = new HashMap<>();

        for(int i = 0; i < s.length() - 9; i++) {
            String sequence = s.substring(i, i + 10);

            System.out.println(sequence);

            sequences.put(sequence, sequences.getOrDefault(sequence, 0) + 1);
        }

        List<String> dnaSequences = new ArrayList<>();

        for(String sequence : sequences.keySet()) {
            if(sequences.get(sequence) >= 2) {
                dnaSequences.add(sequence);
            }
        }

        return dnaSequences;
    }
}