package rc.test.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "epyc")
public class Epyc {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private UUID id;

    @Column(nullable = false)
    private String name;

    private String description;

    @Column(name = "created_at", nullable = false)
    private Date createdAt;

    @Column(name = "modified_at")
    private Date modifiedAt;

    @OneToMany(mappedBy = "epyc", fetch = FetchType.LAZY)
    private List<Task> tasks = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "task_column_id")
    private TaskColumn task_column;
}
