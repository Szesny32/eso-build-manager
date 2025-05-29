package esoBuildManager.esoBuildManager.Database.Item;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
public class ItemCategory {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Integer item_category_id;

    @OneToMany(mappedBy="category", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<ItemType> types = new HashSet<>();

    @OneToMany(mappedBy="category", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<ItemSubtype> subtypes = new HashSet<>();

    @Column(nullable = false)
    private String item_category_name;
}
