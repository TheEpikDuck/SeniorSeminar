class Session {
    
    private int id;
    private List<Student> currentStudents;
    private int max;

    public Session(int id) {
        this.id = id; //refering to current object
        this.max = max;
        this.currentStudents = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public int getMax(){
        return max;
    }

    public List<Student> getCurrentStudents() {
        return currentStudents;
    }
}//students in each session and max ppl in each of them