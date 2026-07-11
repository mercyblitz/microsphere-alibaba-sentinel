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

**Full Changelog**: https://github.com/microsphere-projects/microsphere-alibaba-sentinel/compare/...0.1.0