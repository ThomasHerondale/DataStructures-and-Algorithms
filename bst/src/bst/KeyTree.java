package bst;

import java.util.Optional;

@SuppressWarnings("UnusedReturnValue")
public interface KeyTree<T> {

    void insert(int key, T data);

    // Ritorna il nodo appena cancellato
    KeyNode<T> delete(int key);

    Optional<KeyNode<T>> search(int key);
}
