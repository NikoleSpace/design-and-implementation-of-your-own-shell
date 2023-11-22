#include "Bashiv2VisitorImpl.h"

antlrcpp::Any BashiV2VisitorImpl::visitScript(Bashiv2Parser::ScriptContext *ctx) {
    // Implementa la visita para la regla script
    for (auto statementContext : ctx->statement()) {
        visit(statementContext);
    }
    return nullptr;
}

antlrcpp::Any BashiV2VisitorImpl::visitCommand(Bashiv2Parser::CommandContext *ctx) {
    // Implementa la visita para la regla command
    if (ctx->simpleCommand()) {
        return visit(ctx->simpleCommand());
    } else if (ctx->ifCommand()) {
        return visit(ctx->ifCommand());
    }
    // Añade lógica para otras reglas de command si es necesario
    return nullptr;
}

antlrcpp::Any BashiV2VisitorImpl::visitSimpleCommand(Bashiv2Parser::SimpleCommandContext *ctx) {
    // Implementa la visita para la regla simpleCommand
    /*llvm::Function function = ;
    llvm::BasicBlock *entryBlock = llvm::BasicBlock::Create(*context, "entry", function);
    builder->SetInsertPoint(entryBlock);
    */
    // Añade lógica para generar código LLVM para el simpleCommand

    return nullptr;
}
