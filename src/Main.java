import abstractFactory.*;
import abstractFactory.Programmer;
import adapter.WebMaster;
import adapter.WebMasterAdapter;
import bridge.ApplicationProject;
import bridge.Project;
import bridge.WebProject;
import builder.*;
import chainOfResponsibility.MobiDev;
import chainOfResponsibility.Proza;
import chainOfResponsibility.SoftServe;
import command.AcceptProgrammer;
import command.DeclineProgrammer;
import command.Invoker;
import composite.DevelopersTeam;
import composite.Team;
import decorator.*;
import decorator.ApplicationProgrammer;
import decorator.WebProgrammer;
import facade.WorkersExchange;
import factoryMethod.Worker;
import factoryMethod.WorkerFactory;
import flyWeight.Application;
import flyWeight.Developer;
import flyWeight.Web;
import interpreter.AndExpression;
import interpreter.Expression;
import interpreter.OrExpression;
import interpreter.TerminalExpression;
import iterator.DevelopersFirm;
import iterator.FirmIterator;
import iterator.ProgrammersGroup;
import mediator.MainBrain;
import memento.Caretaker;
import objectPool.ObjectPoolDemo;
import observer.TeamLeader;
import prototype.PrototypeFactory;
import proxy.GlobalDatabase;
import proxy.LocalDatabase;
import proxy.Workers;
import singleton.Singleton;
import state.ProgrammerAccepted;
import state.ProgrammerContext;
import state.ProgrammerDenied;
import state.State;
import strategy.DefaultStrategy;
import strategy.JavaProgrammerStrategy;
import strategy.Myself;
import templateMethod.AppDeveloperSalary;
import templateMethod.CountSalary;
import templateMethod.WebDeveloperSalary;
import visitor.Office;
import visitor.Quarter;
import visitor.Room;
import visitor.WebDeveloperValidator;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
/**
 * Perebykivskiy
 * var 13
 * Проектування системи обліку кадрів на підприємстві
 */

        // <L1>
        /**
         * Породжуючий
         * Отримання копії вже існуючого об'єкта, або можливість швидко генерувати багато подібних екземплярів
         * Не потрібно мати класи web dev/app dev. Це клонування із зміною властивостей.
         */
            /*System.out.println("--- Prototype template ---");
            try {
                String workerPrototype = PrototypeFactory.getInstance(PrototypeFactory.ModelType.WORKER).toString();
                System.out.println(workerPrototype);
            }
            catch (CloneNotSupportedException e){
                e.printStackTrace();
            }
            System.out.println("");*/

        /**
         * Породжуючий
         * Створення єдиного екземпляра об'єкта та єдину глобальну точку доступу до нього
        */
            /*System.out.println("--- Singleton template ---");
            Singleton.getInstance();
            System.out.println("");*/

        /**
         * Породжуючий
         * Обрання реалізації вирішує або нащадок фабричного методу або сам фабричний метод, приймаючи якийсь параметр
         * Define an interface for creating an object, but let subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses.
         */
            /*System.out.println("--- Factory method template ---");
            WorkerFactory workerFactory = new WorkerFactory();
            Worker worker1 = workerFactory.getWorker("Programmer");
            worker1.add();*/
        // </L1>

        // <L2>
        /**
         * Породжуючий
         * Надання інтерфейсу для створення об'єктів без визначення конкретної реалізації.
         * Абстрактна фабрика визначає інтерфейс, що повертає базовий клас, конкретна реалізація фабрики повертає конкретну реалізації якогось типу класу.
         */
        // Створти інтерфейс відділ кадрів
        // Створити 2 фабрики веб та прикладна у них методи повернути програміста та тестувальника
        // Створити 2 класи програміст та тестувальник, вони мають методи веб програміст, веб тестувальник, прикладний програміст, прикладний тестувальник

            /*System.out.println("--- Abstract factory template ---");
            HumanResources humanResources = new WebFactory();
            Programmer programmer = humanResources.getProgrammer();
            Tester tester = humanResources.getTester();

            HumanResources humanResources1 = new ApplicationFactory();
            Programmer programmer1 = humanResources1.getProgrammer();
            Tester tester1 = humanResources1.getTester();*/

        /**
         * Породжуючий
         * Використовується, якщо структура складана та залежить від багатьох чинників
         */
            /*System.out.println("\n--- Builder template ---");
            builder.Programmer webProgrammer = builder.Programmer.newBuilder().setName("Danylo").setType("Web").build();
            builder.Programmer applicationProgrammer = builder.Programmer.newBuilder().setName("Dmytro").setType("Application").build();*/
        // </L2>

        // <L3>
        /**
         * Структурний
         * Дозволяє побудувати деревовидну структуру і працювати з нащадками
         * Робота може йти з багатьма компонентами
         */
            /*System.out.println("\n--- Composite template ---");

            DevelopersTeam myDevelopersTeam = new Team();
            myDevelopersTeam.addProgrammer(new composite.Programmer());

            Team applicationTeam = new Team();
            applicationTeam.addProgrammer(new composite.Programmer());
            applicationTeam.addProgrammer(new composite.Programmer());

            Team additionalApplicationTeam = new Team();
            additionalApplicationTeam.addProgrammer(new composite.Programmer());
            additionalApplicationTeam.addProgrammer(new composite.Programmer());
            additionalApplicationTeam.addProgrammer(new composite.Programmer());

            applicationTeam.addProgrammer(additionalApplicationTeam);
            myDevelopersTeam.addProgrammer(applicationTeam);

            System.out.println("Number of programmers in dev team: " + myDevelopersTeam.countProgrammers());*/

        /**
         * Структурний
         * Швидке та динамічне розширення існуючої функціональності без зміни об'єкта декорування
         * Додання нового функціоналу до існуючого, але робота йде з 1 компонентом
         */
            /*System.out.println("\n--- Decorator template ---");
            decorator.Programmer allInOneProgrammer = new ApplicationProgrammer(new WebProgrammer());
            allInOneProgrammer.getStatus();*/

        /**
         * Структурний
         * Якщо відсутня можливість працювати із об'єктом напряму
         * Керування іншим об'єктом за допомогою посередника
         */
            /*System.out.println("\n--- Proxy template ---");
            Workers workersData = new LocalDatabase(new GlobalDatabase());
            System.out.println("Numbers of workers in local storage: " + workersData.getWorkers("local"));
            System.out.println("Numbers of workers in global storage: " + workersData.getWorkers("global"));*/
        // </L3>

        // <L4>
        /**
         * Структурний
         * Дозволяє користуватись системою навіть коли наші запити є несумісними з самою системою
         * Створюється проміжна система, що дає порозумітись новим командам із старими можливостями
         */
            /*System.out.println("\n--- Adapter template ---");
            adapter.Programmer webProgrammer = new adapter.WebProgrammer();
            webProgrammer.getProgrammer();

            adapter.Programmer webMaster = new WebMasterAdapter(new WebMaster());
            webMaster.getProgrammer();*/
        /**
         * Структурний
         * При розробці дозволяє втручатись у різні етапи проектування різним імплементаціям інтерфейсу
         * Або дозволяє задати послідовність розробки проекту
         */
            /*System.out.println("\n--- Bridge template ---");
            bridge.Programmer applicationProgrammer = new bridge.ApplicationProgrammer();
            bridge.Programmer webProgrammer1 = new bridge.WebProgrammer();

            Project applicationProject = new ApplicationProject();
            applicationProject.setProjectProgrammer(applicationProgrammer);
            applicationProject.getStatus();
            applicationProject.setProjectProgrammer(webProgrammer1);
            applicationProject.getStatus();

            System.out.println("\n");

            Project webProject = new WebProject();
            webProject.setProjectProgrammer(webProgrammer1);
            webProject.getStatus();
            webProject.setProjectProgrammer(applicationProgrammer);
            webProject.getStatus();*/

        /**
         * Структурний
         * Якщо система має багато окремих можливостей, патерн може надати єдину точку доступу для усього
         * Тобто піднімає рівень абстракції системи
         */
            /*System.out.println("\n--- Facade template ---");
            WorkersExchange exchange = new WorkersExchange();
            exchange.programmer();
            exchange.tester();*/

        /**
         * Структурний
         * Якщо деякі дані є одними для багатьох об'єктів, то не потрібно клонувати дані для кожного об'єкта, можна усім об'єктам ссилатись на 1 екземпляр даних
         */
            /*System.out.println("\n--- FlyWeight template ---");
            List<Developer> developersTeam = new ArrayList<>();
            for (int i = 0; i < 10; i++) developersTeam.add(new Web());
            for (int i = 0; i < 15; i++) developersTeam.add(new Application());*/
        // </L4>

        // <L5>
        /**
         * Поведінковий
         * Для приховування логіки колекцій. Легко обходить об'єкти всередині і спрощує роботу
         */
            /*System.out.println("\n--- Iterator template ---");
            DevelopersFirm itdev = createFirm();
            FirmIterator firmIterator = new FirmIterator(itdev);
            while (firmIterator.hasNext()) System.out.println(firmIterator.next());*/

        /**
         * Поведінковий
         * Спрощення координації між різними об'єктами, створюється медіатор, що є посередником
         * Центральна система, що обробляє усі об'єкти послаблює зв'язність об'єктів (об'єкти не ссилаються один на одного), вони працюють незалежно але насправді є єдиним цілим
         * Недоліком стає підвищена складність медіатора
         */
            /*System.out.println("\n--- Mediator template ---");
            MainBrain brain = new MainBrain();
            brain.pushProblem();*/

        /**
         * Поведінковий
         * При зміні об'єкта над яким йде нагляд всі спостерігачі будуть на ці зміни реагувати
         */
            /*System.out.println("\n--- Observer template ---");
            TeamLeader teamLeader = new TeamLeader();
            observer.Developer developer = new observer.Developer();

            developer.addObs(teamLeader);
            developer.getName();*/
        // </L5>

        // <L6>
        /**
         * Поведінковий
         * Передача роботи від 1 класу до іншого до кінця обробробки
         */
            /*System.out.println("\n--- Chain of responsibility template ---");
            chainOfResponsibility.Worker javaDeveloper = new chainOfResponsibility.Worker("Java");
            chainOfResponsibility.Worker iosDeveloper = new chainOfResponsibility.Worker("iOS");
            chainOfResponsibility.Worker cppDeveloper = new chainOfResponsibility.Worker("C++");

            SoftServe softServe = new SoftServe(null);
            MobiDev mobiDev = new MobiDev(softServe);
            Proza proza = new Proza(mobiDev);

            proza.HandleWorker(javaDeveloper);
            proza.HandleWorker(iosDeveloper);
            proza.HandleWorker(cppDeveloper);*/

        /**
         * Поведінковий
         * Задає поведінку об'єкту в залежності від вхідних параметрів
         */
            /*System.out.println("\n--- Strategy template ---");
            Myself me = new Myself();
            me.changeStrategy(new DefaultStrategy());
            me.getEmployer();
            me.changeStrategy(new JavaProgrammerStrategy());
            me.getEmployer();*/

        /**
         * Поведінковий
         * Відокремлення алгоритму роботи від елементу до якого відвідувач буде застосований
         */
            /*System.out.println("\n--- Visitor template ---");
            Room room1 = new Room(true);
            Quarter quarter1 = new Quarter(false);
            Office office1 = new Office(false);

            WebDeveloperValidator webDeveloperValidator = new WebDeveloperValidator();

            room1.accept(webDeveloperValidator);
            quarter1.accept(webDeveloperValidator);
            office1.accept(webDeveloperValidator);*/
        // </L6>

        // <L7>
        /**
         * Поведінковий
         * Можливість повернутись до попереднього стану системи
         */
            /*System.out.println("\n--- Memento template ---");
            Caretaker caretaker = new Caretaker();
            caretaker.save();
            caretaker.startAction();
            caretaker.startAction();
            caretaker.load();
            caretaker.startAction();*/

        /**
         * Поведінковий
         * Зміна поведінки об'єкта тоді коли внутрішній стан змінюється
         */
            /*System.out.println("\n--- State template ---");
            ProgrammerContext programmerContext = new ProgrammerContext();
            State devAccepted = new ProgrammerAccepted();
            State devDenied = new ProgrammerDenied();

            programmerContext.setDevState(devAccepted);
            programmerContext.action();

            programmerContext.setDevState(devDenied);
            programmerContext.action();*/

        /**
         * Поведінковий
         *
         */
            /*System.out.println("\n--- Command template ---");
            command.Programmer appDev = new command.Programmer("Vovan");
            command.Programmer webDev = new command.Programmer("Vityan");

            AcceptProgrammer acceptProgrammer = new AcceptProgrammer(appDev);
            DeclineProgrammer declineProgrammer = new DeclineProgrammer(webDev);

            Invoker invoker = new Invoker();
            invoker.takeHiring(acceptProgrammer);
            invoker.takeHiring(declineProgrammer);

            invoker.placeHiring();*/
        // </L7>

        // <L8>
        /**
         * Поведінковий
         * Утворення власного синтаксису
         */
           /*System.out.println("\n--- Interpreter template ---");
            Expression isWebDevelopers = getWebExpression();
            Expression isAppDevelopers = getAppExpression();

            System.out.println("Is Vova app developer? " + isAppDevelopers.interpret("Vova"));
            System.out.println("Is Vova web delevoper? " + isWebDevelopers.interpret("Vova"));*/

        /**
         * Поведінковий
         * Алгоритм однаковий але елементи алгоритм можуть змінюватись в залежності від методу
         */
            /*System.out.println("\n--- Template method template ---");
            CountSalary webDev = new WebDeveloperSalary();
            System.out.println("Web:");
            webDev.countSalary(10, 12);

            System.out.println("");

            CountSalary appDev = new AppDeveloperSalary();
            System.out.println("App:");
            appDev.countSalary(10, 12);*/
        /**
         * Породжуючий
         *
         */
            /*System.out.println("\n--- Object pool template ---");
            ObjectPoolDemo op = new ObjectPoolDemo();
            op.setUp();
            op.tearDown();
            op.testObjectPool();*/
        // </L8>

    }
    // <L5>
    public static DevelopersFirm createFirm() {
        ProgrammersGroup someProgrammers = new ProgrammersGroup();
        iterator.Programmer programmer1 = new iterator.Programmer();
        programmer1.setName("Vova");
        iterator.Programmer programmer2 = new iterator.Programmer();
        programmer2.setName("Vasya");
        someProgrammers.addProgrammer(programmer1);
        someProgrammers.addProgrammer(programmer2);

        ProgrammersGroup webProgrammers = new ProgrammersGroup();
        iterator.WebProgrammer programmer3 = new iterator.WebProgrammer();
        programmer3.setName("Ivan");
        programmer3.setType("WEB");
        iterator.WebProgrammer programmer4 = new iterator.WebProgrammer();
        programmer4.setName("Michael");
        programmer4.setType("WEB");
        webProgrammers.addProgrammer(programmer3);
        webProgrammers.addProgrammer(programmer4);

        ProgrammersGroup applicationProgrammers = new ProgrammersGroup();
        iterator.ApplicationProgrammer programmer5 = new iterator.ApplicationProgrammer();
        programmer5.setName("Oleksandr");
        programmer5.setType("Application");
        iterator.ApplicationProgrammer programmer6 = new iterator.ApplicationProgrammer();
        programmer6.setName("Dmytro");
        programmer6.setType("Application");
        applicationProgrammers.addProgrammer(programmer5);
        applicationProgrammers.addProgrammer(programmer6);

        DevelopersFirm itdev = new DevelopersFirm();
        itdev.addGroup(someProgrammers);
        itdev.addGroup(webProgrammers);
        itdev.addGroup(applicationProgrammers);

        return itdev;
    }
    // </L5>
    // <L8>
    public static Expression getWebExpression(){
        Expression webDev1 = new TerminalExpression("Vova");
        Expression webDev2 = new TerminalExpression("Ivan");
        return new OrExpression(webDev1, webDev2);
    }
    public static Expression getAppExpression(){
        Expression appDev1 = new TerminalExpression("Sergiy");
        Expression appDev2 = new TerminalExpression("Oleksandr");
        return new AndExpression(appDev1, appDev2);
    }
    // </L8>
    }
