package com.mmendoza.soccerApi.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "news")

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class News {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer newsId;

    @Column(name = "title", nullable = false, length = 50)
    private String title;

    @Column(name = "subtitle", nullable = false, length = 25)
    private String subtitle;

    @Column(name = "description", nullable = false, length = 2000)
    private String description;

    @CreatedDate
    private LocalDate datePublication;

    @JoinTable(
            name = "rel_news_labels",
            joinColumns = @JoinColumn(name = "FK_NEW", nullable = false),
            inverseJoinColumns = @JoinColumn(name = "FK_LABEL", nullable = false)
    )
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Label> labels;

    public void addLabel(Label label) {
        if (labels == null) {
            labels = new ArrayList<>();
        }
        labels.add(label);
    }
}
