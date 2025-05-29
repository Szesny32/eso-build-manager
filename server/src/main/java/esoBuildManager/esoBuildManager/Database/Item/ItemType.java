package esoBuildManager.esoBuildManager.Database.Item;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
public class ItemType {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Integer item_type_id;

    @ManyToOne
    @JoinColumn(name = "item_category_id", nullable = false)
    private ItemCategory category;

    @OneToMany(mappedBy="type", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<ItemSubtype> subtypes = new HashSet<>();

    @Column(nullable = false)
    private String item_type_name;
}
