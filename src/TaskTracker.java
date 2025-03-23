public class TaskTracker {
    public static void main(String args[]) {
        switch (args[1]) {
            case "add": {
                System.out.println("adding");
                break;
            }
            case "update": {
                System.out.println("updating");
                break;
            }
            case "delete": {
                System.out.println("deleting");
                break;
            }
            case "mark-in-progress": {
                System.out.println("marking in progress");
                break;
            }
            case "mark-done": {
                System.out.println("marking done");
                break;
            }
            case "list": {
                if (args[2] != null) {
                    switch(args[2]) {
                        case "done": {
                            System.out.println("listing done tasks");
                            break;
                        }
                        case "todo": {
                            System.out.println("listing todo tasks");
                            break;
                        }
                        case "in-progress": {
                            System.out.println("listing in progress tasks");
                            break;
                        }
                        default: {
                            System.out.println("Unknown list command");
                            break;
                        }
                    }
                }
                System.out.println("listing all tasks");
                break;
            }
            default: {
                System.out.println("Unknown argument");
                break;
            }
        }
    }

}
