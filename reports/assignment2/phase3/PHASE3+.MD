## PHASE 3 now with a fixed seed, new generated tests and mutation testing. (mainCLI is now included)
## Coverage (JaCoCo)
- Instruction coverage: 91% (1563/1714)
- Branch coverage: 95% (212/237)
- Line coverage: 98% (255/295)
- Methods covered: 41/42
- Classes covered: 4/5

Breakdown by Class
- Branch Coverage
    Board: 95% (175/184)
    Cell: 93% (28/30)
    Board.Position: 90% (9/10)
    Board.Direction: n/a (0 branches)
- Instruction Coverage
    Board.Position: 100% (73/73)
    Board.Direction: 100% (44/44)
    Board: 99% (1275/1284)
    Cell: 99% (171/173)
    MainCLI: 0% (0/142)
- Methods Covered
    Board: 22/22
    Cell: 9/9
    Board.Position: 4/4
    Board.Direction: 1/1
    MainCLI: 0/4

## Mutation (PITest)
- Line Coverage: 100% (253/253)
- Mutation score: 91% (224/246)
- Test strength: 92% (224/243)
- Mutants killed: 224
- Mutants survived: 22
- Mutants never executed by any test: 3

Breakdown by Class
- Line Coverage
    Cell: 100% (24/24)
    Board: 100% (229/229)
- Mutation Coverage
    Cell: 94% (30/32)
    Board: 91% (194/214)
- Test Strength
    Cell: 94% (30/32)
    Board: 90% (194/211)