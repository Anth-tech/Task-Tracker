import java.time.ZoneId;
import java.time.ZonedDateTime;

enum Status {
    TODO,
    IN_PROGRESS,
    DONE;
}

public class Task {
    private final ZoneId z = ZoneId.of("America/Chicago");
    private int id;
    private String description;
    private Status status;
    private String createdAt;
    private String updatedAt;

    public Task(int id, String description, Status status) {
        this.id = id;
        this.description = description;
        this.status = Status.TODO;
        this.updatedAt = this.createdAt = ZonedDateTime.now(z).toString();
    }
}
