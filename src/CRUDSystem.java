public interface CRUDSystem {
   void add(String name, String surname, String[] s);
    void remove(int id);
    void update(int id, String name, String surname);
    void select(int id);
}
