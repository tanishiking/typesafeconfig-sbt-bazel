```sh
sbt:typesafeconfig-sbt-bazel> config/test
...
simple.foo comes from config/test application.conf
simple.bar comes from config/main application.conf
simple.baz comes from config/test application.conf
...
[info] - fake test
[success] Total time: 5 s, completed Dec 7, 2022, 4:39:23 PM
```

```sh
❯ bazel test //config/src/test
...
simple.foo comes from config/main application.conf
simple.bar comes from config/main application.conf
simple.baz comes from config/test application.conf
- fake test (35 milliseconds)
..
```

In Bazel, the upstream config wins ???
