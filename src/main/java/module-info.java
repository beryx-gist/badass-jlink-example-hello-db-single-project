module org.example.hellodb {
    requires javafx.controls;
    requires java.sql;
    requires static com.h2database;
    requires static org.hsqldb;
    opens org.example.hellodb to javafx.graphics;
}
