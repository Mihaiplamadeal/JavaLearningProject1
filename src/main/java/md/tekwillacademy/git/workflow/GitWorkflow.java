package md.tekwillacademy.git.workflow;

public class GitWorkflow {
    public static void main(String[] args) {
        String step1 = "Execute git stash in the console";
        String step2 = "Perform git checkout master - to move to the local master branch";
        String step3 = "Execute git fetch command = to see if there are any changes on the remote/origin";
        String step4 = "Execute git pull - this will download the latest changes from origin master to local master";
        String step5 = "Execute git branch <new_branch_name> - to create new branch that is the same as local master";
        String step6 = "Execute git checkout new_branch_name - as result we are redirected to the new created brach";
        String step7 = "Add the task related changes in the solution";
        String step8 = "Execute git commit command form the intellij to stare the changes to the local level, on the current branch";
        String step9 = "Execute git push from Intellij - as result a new remote branch is created with origin with name ";
        String step10 = "Create a pull request from origin new_branch_name into master";
        String step11 = "Add the pull request details like name, description and reviewers";
        String step12 = "If we set at least one approval then we can merge the changes and continue with another task";
        String step13 = "Perform git force push - to update the status of pull request";
        String step14 = "If someone ask for changes we should open the project and maje sure that we are on the same branch name";
        String step15 = "Change the requested lines of code";
        String step16 = "Perform git commit ammen to change the latest executed commit by added your requested changes ";
        String step17 = "Do not forget that locally you are still on the new name branch";



        System.out.println(step1);
        System.out.println(step2);
        System.out.println(step3);
        System.out.println(step4);
        System.out.println(step5);
        System.out.println(step6);
        System.out.println(step7);
        System.out.println(step8);
        System.out.println(step9);
        System.out.println(step10);
        System.out.println(step11);
        System.out.println(step12);
        System.out.println(step13);
        System.out.println(step14);
        System.out.println(step15);
        System.out.println(step16);
        System.out.println(step17);


    }
}
