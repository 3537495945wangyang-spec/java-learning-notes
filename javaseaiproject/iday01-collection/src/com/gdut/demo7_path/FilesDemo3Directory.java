package com.gdut.demo7_path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class FilesDemo3Directory {
    public static void main(String[] args) throws IOException {
    var dir = Path.of("Z:\\code\\javaseaiproject");

        System.out.println("\n列出目录内容");
        System.out.println("=====使用手动循环的方法========");

        Stream<Path> entries = Files.list( dir);
//        Iterator<Path> iterator = entries.iterator();
//        while(iterator.hasNext()){
//            Path entry = iterator.next();//获取每一个条目（文件或目录）
//            System.out.println(entry.getFileName());
//        }
//        System.out.println("\n使用stream 和 forEach");
        // 1. 用 filter 过滤出目录（匿名内部类实现 Predicate<Path>）
        /*filter() 方法会对 entries 流中的每个 Path 元素执行 test() 方法
        只有当 test() 返回 true 的元素才会被保留在新的流中
        最终得到的 directories 流只包含目录类型的路径*/
//        Stream<Path> directories = entries.filter(new Predicate<Path>() {
//            @Override
//            public boolean test(Path path) {
//                return Files.isDirectory(path);
//            }
//        });
        // 2. 用 forEach 打印目录名（匿名内部类实现 Consumer<Path>）
      /*  前面的代码已经筛选出了所有目录，存储在 directories 流中
        这里使用 forEach() 方法遍历流中的每个目录路径
        对每个路径调用 path.getFileName() 获取目录名称
        使用 System.out.println() 将目录名称打印出来*/
//        directories.forEach(new Consumer<Path>() {
//            @Override
//            public void accept(Path path) {
//                System.out.println(path.getFileName());
//            }
//        });

        //lambda表达式
//        Stream<Path> directories = entries.filter(path -> Files.isDirectory(path));
//
//        directories.forEach(path-> System.out.println(path.getFileName()));

        //方法引用
        System.out.println("\n列出目录内容");
      entries.filter(Files :: isDirectory)
              .forEach(System.out :: println);


    // 递归遍历目录树
        System.out.println("\n递归遍历目录树");
    try (Stream<Path> paths = Files.walk(dir)) {
        paths.filter(p -> p.toString().endsWith(".java"))
                .forEach(System.out::println);
    }

        // 限制遍历深度
        System.out.println("\n限制遍历深度");
        try (Stream<Path> paths = Files.walk(dir,3)) {
            paths.filter(p -> p.toString().endsWith(".java"))
                    .forEach(System.out::println);
        }


}
}