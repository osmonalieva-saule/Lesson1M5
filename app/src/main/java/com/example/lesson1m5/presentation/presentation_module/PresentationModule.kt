package com.example.lesson1m5.presentation.presentation_module

import com.example.lesson1m5.presentation.view_model.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val PresentationModule = module {
    viewModel<HomeViewModel> {
        HomeViewModel(
            incrementUseCase = get(),
            decrementUseCase = get(),
            getCountUseCase = get(),
        )
    }
}