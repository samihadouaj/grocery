->RefactoringNumber->42621<-ExtractClass(org.iselab.grocery.controller.ProductController;Class_3;[];[remove|searchByName|showMenu|start])
->RefactoringNumber->42651<-ExtractSuperClass(org.iselab.grocery.controller.ProductController;Class_16;[];[remove|showMenu])
->RefactoringNumber->42661<-DecreaseFieldSecurity(org.iselab.grocery.controller.ProductController;;[productRepository];[])
->RefactoringNumber->42663<-ExtractSuperClass(org.iselab.grocery.controller.ProductController;Class_23;[];[start])
->RefactoringNumber->42673<-MoveMethod(org.iselab.grocery.controller.ProductController;org.iselab.grocery.controller.Shapes;[];[print])
->RefactoringNumber->42677<-ExtractSubClass(org.iselab.grocery.controller.ProductController;Class_32;[shapes];[searchByName])
->RefactoringNumber->42681<-PullUpField(Class_32;org.iselab.grocery.controller.ProductController;[shapes];[])
->RefactoringNumber->42689<-MoveField(org.iselab.grocery.controller.ProductController;Class_36;[shapes];[])
<-endRefactoring marker->
package org.iselab.grocery.controller;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.iselab.grocery.domain.Product;
import org.iselab.grocery.repository.ProductRepository;
import org.iselab.grocery.util.SystemUtils;

public class ProductController {

    private ProductRepository productRepository;

    public ProductController() {
        this.productRepository = new ProductRepository();
    }

    public void print(List<Product> products) {

        String template = "%-2s %4s %-7s %4s %-5s";

        System.out.println("-------------------------------");
        System.out.println(String.format(template, "Id", "|", "Name", "|", "Amount"));
        System.out.println("-------------------------------");

        for (Product p : products) {
            System.out.println(String.format(template, p.getId(), "|", p.getName(), "|", p.getAmount()));
        }
    }

    public int showMenu() {

        SystemUtils.clearScreen();

        SystemUtils.printHeader("Products");

        System.out.println("  [1] Add");
        System.out.println("  [2] Search by Name");
        System.out.println("  [3] Search by Id");
        System.out.println("  [4] Remove");
        System.out.println("  [5] List All");
        System.out.println("  [9] Back");

        System.out.print("Option: ");

        return SystemUtils.getIntFromKeyboard();
    }

    public void listAll() {

        SystemUtils.clearScreen();

        SystemUtils.printHeader("Products", "List All");

        print(productRepository.findAll());

        SystemUtils.pressEnterKeyToContinue();
    }

    public void remove() {

        SystemUtils.clearScreen();

        SystemUtils.printHeader("Products", "Remove by Id");

        System.out.print("Id: ");

        int id = SystemUtils.getIntFromKeyboard();

        System.out.println("----------------");

        Product removed = productRepository.removeById(id);

        if (removed == null) {
            System.out.println("Product not found");
        } else {
            System.out.println("Product " + removed.getName() + " was successfully removed");
        }

        SystemUtils.pressEnterKeyToContinue();
    }

    public void searchByName() {

        SystemUtils.clearScreen();

        SystemUtils.printHeader("Products", "Search by Name");

        System.out.print("Name: ");

        String name = SystemUtils.getStringFromKeyboard();

        print(productRepository.findByName(name));

        SystemUtils.pressEnterKeyToContinue();
    }

    public void searchById() {

        SystemUtils.clearScreen();

        SystemUtils.printHeader("Products", "Search by Id");

        System.out.print("Id: ");

        int id = SystemUtils.getIntFromKeyboard();

        Product p = productRepository.findById(id);

        if (p == null) {
            System.out.println("Product not found");
        } else {
            print(Arrays.asList(p));
        }

        SystemUtils.pressEnterKeyToContinue();
    }

    public void addProduct() {

        SystemUtils.clearScreen();

        SystemUtils.printHeader("Products", "Add");

        Product product = new Product();

        System.out.print("Name: ");
        product.setName(SystemUtils.getStringFromKeyboard());

        System.out.print("Amount: ");
        product.setAmount(SystemUtils.getIntFromKeyboard());

        productRepository.save(product);
    }

    public void start() {
        Shapes shapes = new Shapes();
        int sr = shapes.calculateShape("circle");
        int option = showMenu();

        while (option != 9) {

            switch (option) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    searchByName();
                    break;
                case 3:
                    searchById();
                    break;
                case 4:
                    remove();
                    break;
                case 5:
                    listAll();
                    break;
            }

            option = showMenu();
        }
    }

}
