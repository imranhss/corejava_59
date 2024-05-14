
package inter;


public interface ICrud<T> {
    
    void save(T t);
    void delete(T t);
    
}
