    package basic.CruidTest.entity;

    import lombok.Data;

    import javax.persistence.*;

    @Entity
    @Data
    @Table(name = "result")
    public class Result {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id_result")
        private Long idResult;

        @Column(name = "id_user")
        private Long idUser;
        @Column(name = "id_test")
        private Long idTest;
        @Column(name = "score")
        private String score;

        // getters and setters
    }
