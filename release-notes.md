# Release Notes

## v0.1.0

# Release Notes - Version 0.1.0

## New Features
- Added `spring-cloud` module to dependency BOM for improved dependency management. ([a045f3d](#))
- Introduced Sentinel Spring Cloud auto-configuration for enhanced integration. ([e5632c2](#))
- Added post-checks and context assertions for Sentinel integration across Hibernate, MyBatis, and Redis plugins. ([03e5d6c](#), [b48337a](#), [6c7c603](#), [9e2eb80](#))
- Added auto-installation of Sentinel DB integration plugins. ([6ef3d9a](#))
- Split Sentinel auto-configuration by integration module for modularity. ([e3cce4b](#))

## Bug Fixes
- Fixed Hibernate `core groupId` resolution in `spring-cloud` module. ([8933e4a](#))
- Resolved plugin initialization and Sentinel context cleanup issues. ([f064753](#))
- Corrected typo in Sentinel conditional annotation. ([71c253f](#))

## Documentation
- Updated Javadoc to clarify Sentinel availability annotations. ([53f2e81](#))
- Enhanced JavaDoc for Redis enabled property and `RedisAutoConfiguration`. ([733ecc8](#), [6b6b34a](#))
- Clarified MyBatis plugin enable property documentation. ([aa06186](#))

## Dependency Updates
- Bumped versions:
  - `microsphere-redis` to 0.1.12. ([1c3a471](#))
  - `microsphere-hibernate` to 0.1.8. ([9c9671b](#))
  - `microsphere-mybatis` to 0.1.14. ([c0c294a](#))
  - `microsphere-alibaba-druid` to 0.1.19. ([eb2da68](#))
  - Parent and Microsphere BOM versions updated to 0.1.24. ([c0dbb39](#))

## Test Improvements
- Refactored Redis plugin tests to use shared test configuration. ([6c7c603](#), [9efbb7f](#))
- Added tests for MyBatis auto-configuration and conditions. ([c57b055](#))
- Added tests for Druid auto-config condition validations. ([bb43caf](#))
- Enhanced Sentinel integration tests for web, Redis, and MyBatis plugins. ([5a97574](#), [b43e3d1](#), [efbca36](#))

## Build and Workflow Enhancements
- Updated `maven-publish.yml` for improved publishing workflow. ([7a140c2](#))

## Other Changes
- Removed Microsphere Spring Cloud BOM import and aligned dependency configurations. ([d150e4e](#), [a882047](#))
- Refactored and normalized Javadoc spacing in auto-configurations. ([258a9fc](#))
- Reordered imports across Sentinel modules for consistency. ([11c6974](#))

---

**Note:** For a detailed list of changes, refer to the full commit history.

**Full Changelog**: https://github.com/microsphere-projects/microsphere-alibaba-sentinel/compare/...0.1.0## v0.1.1

_Release notes generation failed. Raw commits since 0.1.0:_

```
f555a82 Merge pull request #54 from microsphere-projects/dev-1.x
f31d294 Merge pull request #53 from mercyblitz/dev-1.x
f98e0e2 Bump fastjson to 2.0.63
f874704 Merge pull request #52 from mercyblitz/dev-1.x
9dec0fc Tidy POM test deps and add java-test
29ed5c1 Use static field access in SentinelUtils
b90559c Bump microsphere-redis to 0.1.13
f592c04 Bump microsphere-hibernate to 0.1.9
8a18a27 Bump microsphere-mybatis to 0.1.15
5b975d3 Bump Alibaba Druid BOM to 0.1.20
a0e361c Bump microsphere-spring-cloud to 0.1.25
0764fb3 Update branch version matrix in README
1747d2f Add Sentinel metrics and node event helpers
016d0fe chore: merge release-1.x into dev-1.x [skip ci]
e757cf2 chore: bump version to next patch after publishing 0.1.0
```

**Full Changelog**: https://github.com/microsphere-projects/microsphere-alibaba-sentinel/compare/0.1.0...0.1.1## v0.1.2

_Release notes generation failed. Raw commits since 0.1.1:_

```
4314ba1 Update version numbers in README.md
a6569b1 Merge pull request #55 from mercyblitz/dev-1.x
16fecad Add callback accessors for Sentinel singletons
ca7b969 Refactor Sentinel callback registration
5229a98 Mark ClusterNodeAdded listener functional
9b4cac9 Use EventDispatcher.of in node publisher
97e60f3 chore: merge release-1.x into dev-1.x [skip ci]
fb22619 chore: bump version to next patch after publishing 0.1.1
```

**Full Changelog**: https://github.com/microsphere-projects/microsphere-alibaba-sentinel/compare/0.1.1...0.1.2## v0.1.3

_Release notes generation failed. Raw commits since 0.1.2:_

```
e8e3c82 Update version numbers in README.md
168b635 chore: bump version to next patch after publishing 0.1.2
```

**Full Changelog**: https://github.com/microsphere-projects/microsphere-alibaba-sentinel/compare/0.1.2...0.1.3## v0.1.4

_Release notes generation failed. Raw commits since 0.1.3:_

```
068e5e0 Update version numbers in README.md
1a2681d Update fastjson version to 2.0.64
d12c188 Merge pull request #56 from mercyblitz/dev-1.x
3d0c80f Merge branch 'microsphere-projects:dev-1.x' into dev-1.x
22801f4 chore: merge release-1.x into dev-1.x [skip ci]
0b8a964 chore: bump version to next patch after publishing 0.1.3
18119c7 Auto-load Sentinel slot callbacks via SPI
45677b8 chore: merge release-1.x into dev-1.x [skip ci]
```

**Full Changelog**: https://github.com/microsphere-projects/microsphere-alibaba-sentinel/compare/0.1.3...0.1.4